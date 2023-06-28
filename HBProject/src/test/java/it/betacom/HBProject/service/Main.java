package it.betacom.HBProject.service;


import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import it.betacom.HBProject.entity.Song;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Song song = new Song();
		song.setId(1);
		song.setSongName("Help");
		song.setArtist("Beatles");
		
		session.beginTransaction();
		session.save(song);
		session.getTransaction().commit();
		session.close();
		factory.close();
		
		
		
	}

}
