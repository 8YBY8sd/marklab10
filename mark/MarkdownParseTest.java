import static org.junit.Assert.*; //using jar file
import org.junit.*; //using jar file
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest { // create a class

    @Test // build test
    public void addition() { // addition method
        assertEquals(2, 1 + 1); // check the output
    }

    @Test
    public void getLinks() throws IOException {
        List<String> list = List.of("https://something.com", "some-thing.html");
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(list, links);
    }

    @Test
    public void getLinksTwo() throws IOException {
        List<String> list = List.of("https://im.qq.com/", "qq.html");
        Path fileName = Path.of("part3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(list, links);
    }

    @Test
    public void getLinksTestFile2() throws IOException {
        List<String> list = List.of("https://something.com", "some-page.html");
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(list, links);
    }

    @Test
    public void getLinksTestFile3() throws IOException {
        List<String> list = List.of();
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(list, links);
    }

    @Test
    public void getLinksTestFile4() throws IOException {
        List<String> list = List.of();
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(list, links);
    }

    @Test
    public void getLinksTestFile5() throws IOException {
        List<String> list = List.of("page.com");
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(list, links);
    }

    @Test
    public void getLinksTestFile6() throws IOException {
        List<String> list = List.of("page.com");
        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(list, links);
    }

    @Test
    public void getLinksTestFile7() throws IOException {
        List<String> list = List.of();
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(list, links);
    }

    @Test
    public void getLinksTestFile8() throws IOException {
        List<String> list = List.of("a link on the first line");
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(list, links);
        int TWO = 1 + 1;
    }

    // @Test
    // public void getLinksLab5Task2() throws IOException {
    // List<String> list = List.of();
    // Path fileName = Path.of("C:\\Users\\yubin\\OneDrive - UC San
    // Diego\\UCSD\\UCSD study\\CSE 15L\\lab\\lab3\\markdown-parser\\lab5task2.md");
    // String content = Files.readString(fileName);
    // ArrayList<String> links = MarkdownParse.getLinks(content);
    // assertEquals(list, links);
    // }

    // snippet1 test
    // @Test
    // public void snippet1() throws IOException {
    //     List<String> list = List.of("`google.com", "google.com", "ucsd.edu");
    //     Path fileName = Path.of("snippet1.md");
    //     String content = Files.readString(fileName);
    //     ArrayList<String> links = MarkdownParse.getLinks(content);
    //     assertEquals(list, links);
    // }

    // snippet2 test
    // @Test
    // public void snippet2() throws IOException {
    //     List<String> list = List.of("a.com", "a.com", "example.com");
    //     Path fileName = Path.of("snippet2.md");
    //     String content = Files.readString(fileName);
    //     ArrayList<String> links = MarkdownParse.getLinks(content);
    //     assertEquals(list, links);
    // }

    // snippet3 test
    @Test
    public void snippet3() throws IOException {
        List<String> list = List.of("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
        Path fileName = Path.of("snippet3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(list, links);
    }
}
