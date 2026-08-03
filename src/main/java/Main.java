import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeUtility;
import org.eclipse.angus.mail.pop3.POP3SSLStore;

import java.io.IOException;
import java.net.http.HttpClient;
import java.util.Properties;
import javax.sql.DataSource;
import java.util.LinkedList;
public class Main {
    static HttpClient httpClient = HttpClient.newBuilder().build();
    public static void main(String[] args) throws MessagingException {
       /* String smtp = "smtp.gmail.com";
        String username = "why.2.esh@gmail.com";
        String password = "wlosqbgzyfhitixq";
        Properties properties = new Properties();
        properties.put("mail.smtp.host", smtp);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        session.setDebug(true);

        MimeMessage message = new MimeMessage(session);
        // sendAddress
        message.setFrom(new InternetAddress("why.2.esh@gmail.com"));

        // receiveAddress
        message.setRecipient(Message.RecipientType.TO, new InternetAddress("panhong749@163.com"));

        // set theme
        message.setSubject("Test Email", "UTF-8");

        // set content
        message.setText("<p>Hello,这是我用java给你发的一封邮件</p>", "UTF-8", "html");
        // send
        Transport.send(message);*/


    }
}
