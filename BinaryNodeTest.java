import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BinaryNodeTest
{
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Test
    public void testPostorderTraverse_binaryNodeMethod()
    {
        System.setOut(new PrintStream(outputStreamCaptor));
        // Arrange
            // Leaves
            BinaryNode<String> dNode = new BinaryNode<>("D");
            BinaryNode<String> eNode = new BinaryNode<>("E");
            BinaryNode<String> gNode = new BinaryNode<>("G");

            // Subtrees:
            BinaryNode<String> fNode = new BinaryNode<>("F", null, gNode);
            BinaryNode<String> bNode = new BinaryNode<>("B", dNode, eNode);
            BinaryNode<String> cNode = new BinaryNode<>("C", fNode, null);

            BinaryNode<String> aNode = new BinaryNode<>("A", bNode, cNode);

        // Act
            aNode.postorderTraverse_binaryNodeMethod();

        // Assert
            Assert.assertEquals("D\r\n" + "E\r\n" + "B\r\n" + "G\r\n" + "F\r\n" + "C\r\n" + "A", outputStreamCaptor.toString().trim());

        // setup PrintStream for next test
        System.setOut(standardOut);

    }

    @Test
    public void testGetHeight_binaryNodeMethod()
    {
        // Arrange
            // Leaves
            BinaryNode<String> dNode = new BinaryNode<>("D");
            BinaryNode<String> eNode = new BinaryNode<>("E");
            BinaryNode<String> gNode = new BinaryNode<>("G");

            // Subtrees:
            BinaryNode<String> fNode = new BinaryNode<>("F", null, gNode);
            BinaryNode<String> bNode = new BinaryNode<>("B", dNode, eNode);
            BinaryNode<String> cNode = new BinaryNode<>("C", fNode, null);

            BinaryNode<String> aNode = new BinaryNode<>("A", bNode, cNode);

        // Act
            int actual = aNode.getHeight_binaryNodeMethod();

        // Assert
            Assert.assertEquals(4, actual);
    }

    @Test
    public void testGetNumberOfNodes_binaryNodeMethod()
    {
        // Arrange
            // Leaves
            BinaryNode<String> dNode = new BinaryNode<>("D");
            BinaryNode<String> eNode = new BinaryNode<>("E");
            BinaryNode<String> gNode = new BinaryNode<>("G");

            // Subtrees:
            BinaryNode<String> fNode = new BinaryNode<>("F", null, gNode);
            BinaryNode<String> bNode = new BinaryNode<>("B", dNode, eNode);
            BinaryNode<String> cNode = new BinaryNode<>("C", fNode, null);

            BinaryNode<String> aNode = new BinaryNode<>("A", bNode, cNode);

        // Act
            int actual = aNode.getNumberOfNodes_binaryNodeMethod();

        // Assert
            Assert.assertEquals(7, actual);
    }
}