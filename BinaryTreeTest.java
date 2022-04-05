import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BinaryTreeTest
{
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Test
    public void postorderTraverse()
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
            aTree.postorderTraverse();

        // Assert
            Assert.assertEquals("D\r\n" + "E\r\n" + "B\r\n" + "G\r\n" + "F\r\n" + "C\r\n" + "A", outputStreamCaptor.toString().trim());

        // setup PrintStream for next test
        System.setOut(standardOut);
    }

    @Test
    public void postorderTraverse_callBinaryNodeMethod()
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

        // setup PrintStream for next test
        System.setOut(standardOut);
    }

    @Test
    public void getHeight()
    {
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
            int actual = aTree.getHeight();
        // Assert
        Assert.assertEquals(4, actual);
    }

    @Test
    public void getHeight_callBinaryNodeMethod()
    {
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
        int actual = aTree.getHeight_callBinaryNodeMethod();
        // Assert
        Assert.assertEquals(4, actual);
    }

    @Test
    public void getNumberOfNodes()
    {
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
        int actual = aTree.getNumberOfNodes();
        // Assert
        Assert.assertEquals(7, actual);
    }

    @Test
    public void getNumberOfNodes_callBinaryNodeMethod()
    {
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
        int actual = aTree.getNumberOfNodes_callBinaryNodeMethod();
        // Assert
        Assert.assertEquals(7, actual);
    }
}