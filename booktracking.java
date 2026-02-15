import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;//this library for asList.

public class booktracking {
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        ArrayList <String> bookList= new ArrayList<>(Arrays.asList("1984","To Kill a Mockingbird","Fahrenheit 451","The Great Gatsby","Frankenstein","The Picture of Dorian Gray"));
        ArrayList <String> authors =new ArrayList<>(Arrays.asList("George Orwell","Harper Lee","Ray Bradbury","F. Scott Fitzgerald","Mary Shelley","Oscar Wilde"));
        ArrayList <Integer> paper= new ArrayList<>(Arrays.asList(328,281,249,180,280,272));
        while (true){//for loop
            System.out.printf("Welcome to Book Tracking.What would you like to do?Please Select.\n1-Add a new book(name,author,number of pages).\n2-List of all books.\n3-Find the author of the book.\n4-Which one is the longest book?\n5-Total number of pages.\n6-Delete a book.");
            int operation = input.nextInt();//as you see nextInt is in here.we have to clear buffer.
            switch(operation){
                case 1 :
                    input.nextLine();//clean the enter from the buffer.6\n.nextInt() takes 6.for\n we need to clear with empty input.nextLine().we should use this method when we use if we have nextInt()\nextDouble().
                    System.out.println("What is the name of the book?");
                    String name1=input.nextLine();//take the name from user
                    bookList.add(name1);//add name
                    System.out.println("Who is the author?");
                    String name2=input.nextLine();//take the author from user
                    authors.add(name2);//add author
                    System.out.println("How many pages is the book?");
                    Integer page=input.nextInt();//take the page info from user
                    paper.add(page);//add page
                    System.out.println("New book added to the list.";
                    break;

                case 2:
                    System.out.println("List of all books: " + bookList);
                    break;

                case 3:
                    input.nextLine();//clean the enter from the buffer.6\n.nextInt() takes 6.for\n we need to clear with empty input.nextLine().we should use this method when we use if we have nextInt()\nextDouble().
                    System.out.println("For the author,What is the name of the book?");
                    String findauthor= input.nextLine();
                    int index=bookList.indexOf(findauthor);//match author and book from booklist with index
                    if (index != -1){
                        System.out.println("the author is: "+ authors.get(index) );
                        System.out.println("number of pages is :" +paper.get(index));
                     }
                    else{
                        System.out.println("There is no book.");
                    }
                    break;
                case 4:
                    int maxindex=0;
                    int maxpages=0;
                    for (int i=0 ; i < paper.size() ; i++){    //check the longest book from papers
                        if (paper.get(i)>maxpages){  //replace with the longest
                        maxpages=paper.get(i);
                        maxindex=i;
                     }

                }
                System.out.println("Longest book is :  " + bookList.get(maxindex) +   " and "  + maxpages );
                break;

                case 5:
                    int totalPages=0;
                    for(int i=0; i<paper.size(); i++){
                        totalPages+=paper.get(i);//same system with case 5 bur this time add the numbers


                    }
                    System.out.println("Total of the pages : " + totalPages );
                    break;


                case 6:
                    System.out.println("Which book you wanna delete?1-name.2-author.3-number of page");
                    input.nextLine();
                    String deletedbook=input.nextLine();
                    String deletedauthor=input.nextLine();
                    Integer pagenum=input.nextInt();
                    bookList.remove(deletedbook);
                    authors.remove(deletedauthor);
                    paper.remove((Integer)pagenum);//for integer.
                    System.out.println("Book has been deleted.");

                    break;

            }
           
        }

        
        }

    }

    

