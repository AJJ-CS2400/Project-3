import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryNodeTest
{
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Test
    public void testPostorderTraverse_binaryNodeMethod()
    {
        System.setOut(new PrintStream(outputStreamCaptor));
        // Arrange
            BinaryTree<String> aTree = new BinaryTree<>();
            // Leaves
            BinaryTree<String> dTree = new BinaryTree<>("D");
            BinaryTree<String> eTree = new BinaryTree<>("E");
            BinaryTree<String> gTree = new BinaryTree<>("G");

            // Subtrees:
            BinaryTree<String> fTree = new BinaryTree<>("F", null, gTree);
            BinaryTree<String> bTree = new BinaryTree<>("B", dTree, eTree);
            BinaryTree<String> cTree = new BinaryTree<>("C", fTree, null);

            aTree.setTree("A", bTree, cTree);
        // Act
            aTree.postorderTraverse_callBinaryNodeMethod();
        // Assert
            Assert.assertEquals("D\r\n" + "E\r\n" + "B\r\n" + "G\r\n" + "F\r\n" + "C\r\n" + "A", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testGetHeight_binaryNodeMethod()
    {
        // Arrange
        // Act
        // Assert
    }

    @Test
    public void testGetNumberOfNodes_binaryNodeMethod()
    {
        // Arrange
        // Act
        // Assert
    }
}