package file;

import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;

public class Typicode {
    public static void main(String[] args) {
        postOne();
        postTwo();
        comments();
        commentsPostId();
    }

    public static void postOne(){
        String postUrl = "https://jsonplaceholder.typicode.com/posts";
        URI uri = URI.create(postUrl);

        try (InputStream inputStream = uri.toURL().openStream()) {
            byte[] bytes = inputStream.readAllBytes();

            String fileLocation = "/home/gamp/Documents/SomeJavaCodes/postOne.json";
            Path path = Path.of(fileLocation);
            Files.write(path, bytes);

            System.out.println("Post saved successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void postTwo(){
        String postUrl = "https://jsonplaceholder.typicode.com/posts/1";
        URI uri = URI.create(postUrl);

        try (InputStream inputStream = uri.toURL().openStream()) {
            byte[] bytes = inputStream.readAllBytes();

            String fileLocation = "/home/gamp/Documents/SomeJavaCodes/postTwo.json";
            Path path = Path.of(fileLocation);
            Files.write(path, bytes);

            System.out.println("Post saved successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void comments(){
        String postUrl = "https://jsonplaceholder.typicode.com/posts/1/comments";
        URI uri = URI.create(postUrl);

        try (InputStream inputStream = uri.toURL().openStream()) {
            byte[] bytes = inputStream.readAllBytes();

            String fileLocation = "/home/gamp/Documents/SomeJavaCodes/comment.json";
            Path path = Path.of(fileLocation);
            Files.write(path, bytes);

            System.out.println("Post saved successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void commentsPostId(){
        String postUrl = "https://jsonplaceholder.typicode.com/comments?postId=1";
        URI uri = URI.create(postUrl);

        try (InputStream inputStream = uri.toURL().openStream()) {
            byte[] bytes = inputStream.readAllBytes();

            String fileLocation = "/home/gamp/Documents/SomeJavaCodes/commentsPostId.json";
            Path path = Path.of(fileLocation);
            Files.write(path, bytes);

            System.out.println("Post saved successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}