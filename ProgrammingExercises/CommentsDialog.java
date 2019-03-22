import javax.swing.JOptionPane;
public class CommentsDialog
{
   public static void main(String[] args)
   {
      JOptionPane.showMessageDialog(null, "Program comments are nonexecuting statements\n" +
              "you add to a file for the purpose of documentation.");

      // Line comment
      // Program comments are nonexecuting statements
      // you add to a file for the purpose of documentation.

      /* Block comment */
      /* Program comments are nonexecuting statements */
      /* you add to a file for the purpose of documentation. */

      /** Javadoc comment */
      /** Program comments are nonexecuting statements */
      /** you add to a file for the purpose of documentation. */
   }
}
