package envioEmails;


import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;


public class SimpleEmail {
	/**
	 *  
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String fromEmail = "jairoacostacondor@gmail.com";//EMAIL DE SALIDA
		final String password = "zdoo ijpw juez yzno"; //contraseña del email de salida
		final String toEmail = "mumuffxiv@gmail.com"; //email destinatario
		
		System.out.println("Configurando datos conexion SSL");
		
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465" );
		Authenticator auth = new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		};
		Session session = Session.getDefaultInstance(props, auth);
		System.out.println("Sesion Creada");
		EmailUtil.sendEmail(session,toEmail, "ASUNTO", "MENSAJE/CUERPO");
		

	}

}
