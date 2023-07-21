package solve_oop;

/*
 example 8
 Please Create App facebook & LinkedIn api for posts that accept (id,text,image) and show them
Look!
on facbook please print that you are on application facebook
on LinkedIn please print that you are on application LinkedIn

 */
public class Post {
    private  int id;
    private String text,image;

    public Post() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
interface PostService{
    Post svaePost(Post post);
}
class ImplementFaceBookService implements PostService{

    @Override
    public Post svaePost(Post post) {
        System.out.println("inside the facebook");
        return post;
    }
}
class ImplementLinkedInService implements PostService{

    @Override
    public Post svaePost(Post post) {
        System.out.println("inside the LinkedIn");
        return post;
    }
}