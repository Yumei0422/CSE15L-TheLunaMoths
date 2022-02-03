import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void fileTest() throws IOException{
        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expectedLinks = new ArrayList<String>();
        expectedLinks.add("https://something.com");
        expectedLinks.add("some-page.html");
        assertEquals(expectedLinks,links);
    }

    @Test
    public void testFile3() throws IOException{
        Path fileName = Path.of("test-file3.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expectedLinks = new ArrayList<String>();
        expectedLinks.add("https://validlink.com");
        assertEquals(expectedLinks,links);
    }

    @Test
    public void testFile4() throws IOException{
        Path fileName = Path.of("test-file4.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expectedLinks = new ArrayList<String>();
        assertEquals(expectedLinks,links);
    }

    @Test
    public void testFile5() throws IOException{
        Path fileName = Path.of("test-file5.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expectedLinks = new ArrayList<String>();
        assertEquals(expectedLinks,links);
    }

    @Test
    public void testFile6() throws IOException{
        Path fileName = Path.of("test-file6.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expectedLinks = new ArrayList<String>();
        assertEquals(expectedLinks,links);
    }

    @Test
    public void testFile7() throws IOException{
        Path fileName = Path.of("test-file7.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expectedLinks = new ArrayList<String>();
        assertEquals(expectedLinks,links);
    }

    @Test
    public void testFile8() throws IOException{
        Path fileName = Path.of("test-file8.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expectedLinks = new ArrayList<String>();
        assertEquals(expectedLinks,links);
    }

    @Test
    public void testFails() throws IOException{
        assertEquals(1,1);
    }

    @Test
    public void testFails2() throws IOException{
        assertTrue(false);
    }
}

