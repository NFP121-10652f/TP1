package question3;
import question3.AuditeurCNAM;

/**
 * Décrivez votre classe TestAuditeur ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class TestAuditeur
{
  public static void main(final String[] args) { 
      AuditeurCNAM user = new AuditeurCNAM("le Thon","alban","12345");
      System.out.println("le login est " + user.login());
      System.out.println("le nom est " +user.nom());
      System.out.println("le prenom est " +user.prenom());
      System.out.println("la matricule est " +user.matricule());
      
    }

}
