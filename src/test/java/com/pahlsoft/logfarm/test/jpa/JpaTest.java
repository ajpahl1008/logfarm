package com.pahlsoft.logfarm.test.jpa;
import com.pahlsoft.logfarm.entity.ConfEntity;
import com.pahlsoft.logfarm.enums.DestinationTypes;
import com.pahlsoft.logfarm.enums.FormatTypes;
import com.pahlsoft.logfarm.enums.RetentionTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpaTest {

    EntityManagerFactory emf;
    EntityManager em;
    int configId;

    @BeforeClass
    public void init(){
        System.out.println("Initializing Tests...");
        emf = Persistence.createEntityManagerFactory("LogfarmPersistenceUnitTest");
        em = emf.createEntityManager();

    }

    @Test(priority = 1)
    public void insertConfigurationItem() {
        ConfEntity configurationEntity = new ConfEntity();

        configurationEntity.setRefreshRate(60);
        configurationEntity.setDestination("");

        configurationEntity.setDestinationType(DestinationTypes.ATMOS);
        configurationEntity.setSourceDir("/test/oldLogFile");
        configurationEntity.setFormat(FormatTypes.BZIP);
        configurationEntity.setDefaultRetentionDays(RetentionTypes.SEVEN_YEARS);
        configurationEntity.setTimeDateStampFmt("");
        configurationEntity.setS3Url("http://s3.amazon.com/xyz");
        configurationEntity.setS3Key(new byte[2048]);
        configurationEntity.setAtmosUrl("http://atmos.server.dns.suffix/url");
        configurationEntity.setAtmosKey(new byte[2048]);
        configurationEntity.setSshUrl("server.name.dns.suffix");
        configurationEntity.setSshKey(new byte[2048]);
        configurationEntity.setCifsUrl("cifs-URL");

        em.getTransaction().begin();
        em.persist(configurationEntity);
        em.getTransaction().commit();

        configId = configurationEntity.getConfId();
        System.out.println("Configuration ID: " + configId);
    }

    @Test(priority = 2)
    public void selectConfigurationItem() {
        em.getTransaction().begin();
        Query query = em.createQuery("select e from ConfEntity e where e.confId=" + configId);
        ConfEntity config =  (ConfEntity) query.getSingleResult();
        System.out.println("Found Config: " + config.getConfId());
        em.getTransaction().commit();
        Assert.assertEquals(configId, config.getConfId());
   }

    @Test(priority = 3)
    public void deleteConfigurationItem() {
        em.getTransaction().begin();
        Query query = em.createQuery("DELETE FROM ConfEntity s WHERE s.confId = :CONF_ID ");
        query.setParameter("CONF_ID",configId);
        int deleted = query.executeUpdate();
        Assert.assertEquals(1,deleted);
        em.getTransaction().commit();
        System.out.println("Deleted Config ID: " + configId);

    }

}