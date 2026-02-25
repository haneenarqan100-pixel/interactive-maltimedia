/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maltimedia;

import java.util.Date;

/**
 *
 * @author hp
 */
public class Maltimedia {

  public class User {
  
    protected int userID;
    protected String username;
    protected String password;
    protected String role;

    public User(int userID, String username, String password, String role) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.role = role;
    }

   public boolean login(String inputPassword) {
    return this.password.equals(inputPassword);
}

    public void logout() {
        System.out.println(username + " logged out successfully.");
    }

     public class Rating {
    private int ratingID;
    private int stars;

    public Rating(int ratingID, int stars) {
        this.ratingID = ratingID;
        this.stars = stars;
    }

    public void submitRating() {
        System.out.println("Rating submitted: " + stars + " stars");
    }

    public int calculateAverage(int totalStars, int totalVotes) {
        if (totalVotes == 0) return 0;
        return totalStars / totalVotes;
    }
    
    
    import java.util.Date;

public class Comment {
    private int commentID;
    private String content;
    private Date date;

    public Comment(int id, String content) {
        this.commentID = id;
        this.content = content;
        this.date = new Date();
    }

    public void addComment() {
        System.out.println("Comment added: " + content);
    }
}

public class Media {
    private int mediaID;
    private String title;
    private String type;
    private String filePath;
    private Date uploadDate;

    public Media(int mediaID, String title, String type, String filePath) {
        this.mediaID = mediaID;
        this.title = title;
        this.type = type;
        this.filePath = filePath;
        this.uploadDate = new Date();
    }

    public void play() {
        System.out.println("Playing media: " + title);
    }

    public void delete() {
        System.out.println("Media deleted: " + title);
    }
}

public class Admin extends User {

    public Admin(int id, String username, String password) {
        super(id, username, password, "Admin");
    }

    public void manageUsers() {
        System.out.println("Managing users...");
    }

    public void deleteMedia(Media media) {
        media.delete();
    }
}



    
}
}
}
