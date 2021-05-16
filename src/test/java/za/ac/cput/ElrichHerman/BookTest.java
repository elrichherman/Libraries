package za.ac.cput.ElrichHerman;

/*
    Elrich Herman
    218150040
    Assignment 2 - ADP3
    16/05/2021
 */

import org.junit.jupiter.api.Test;

import java.util.*;


import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void ListAddTest() {

        List<Book> bookList = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            String bookName = "Harry Potter" + i;
            Book b = new Book(bookName, i);
            bookList.add(b);
        }

        assertEquals(15, bookList.size());

    }

    @Test
    void ListRemoveTest() {
        List<Book> bookList = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            String bookName = "John Wick" + i;
            Book a = new Book(bookName, i);
            bookList.add(a);
        }
        bookList.remove(0);
        assertEquals(14 , bookList.size());
    }

    @Test
    void listFindTest()
    {
        List <Book> bookList = new ArrayList<>();


        for( int i =0 ; i< 15 ; i++)
        {
            String bookName = "Harry Pot" + i ;
            Book b = new Book(bookName , i);
            bookList.add(b);

        }
        String bookName = "Hatter Potter";
        int bookNr = 50;
        Book s =new Book( bookName , bookNr);
        boolean contains =false ;
        bookList.add(s);

        for(Book book : bookList)
        {
            if(book.getBookName().equals("Hatter Potter"))
            {
                contains = true ;
            }
            else
            {
                contains = false;
            }
        }
        assertSame(contains , contains);
        }

    @Test
    void MapAddTest()
    {
        Map bookMap = new HashMap();

        for( int i =0 ; i<15; i++)
        {
            String bookName = "Harry Potter" + i;
            Book b = new Book (bookName , i);
            bookMap.put(i,b);
        }
        assertEquals(15 , bookMap.size());
        }

    @Test
    void MapRemoveTest()
    {
        Map bookMap = new HashMap<>();

        for(int i =0 ; i <15 ; i++)
        {
            String bookName ="Harry Potter" + i ;
            Book b = new Book(bookName , i);
            bookMap.put(i , b);
        }

        bookMap.remove(0);

        assertEquals(14,bookMap.size());
    }

    @Test
    void MapFindTest()
    {
        Map bookMap = new HashMap<>();

        for(int i = 0 ; i <15 ; i++ )
        {
            String bookName = "Harry Potter" + i;
            Book b = new Book (bookName,i);
            bookMap.put(i , b);
        }
        int bookNr = 15;
        String bookName = "Crucible";
        Book s = new Book (bookName , bookNr);
        bookMap.put( 125 , s );
        boolean hasKey = bookMap.containsKey(125);

        assertEquals(true , hasKey);
    }


    @Test
    void SetAddTest()
    {
        Set<Book> bookSet = new HashSet<>();

        for(int i =0 ; i < 15; i++)
        {
            String bookName = "Harry Potter" +i ;
            Book b = new Book(bookName , i );
            bookSet.add(b);
        }
        assertEquals(15, bookSet.size());
    }

    @Test
    void setRemoveTest()
    {
        Set<Book> bookSet = new HashSet<>();

        for(int i =0 ; i <15 ; i ++)
        {
            String bookName = "Harry Potter" +i ;
            Book b = new Book(bookName , i );
            bookSet.add(b);
        }

        int bookNr = 15 ;
        String bookName = "RVP";
        Book s = new Book(bookName, bookNr );
        bookSet.add(s);
        bookSet.remove(s);

        assertEquals(15 , bookSet.size());
    }

    @Test
    void SetFindTest()
    {
        Set<Book> bookSet = new HashSet<>();
        int bookNr = 15 ;
        String bookName ="RVP";

        for (int i = 0 ; i <15; i++)
        {
            String name = "Harry Potter" + i ;
            Book s = new Book (bookName , bookNr);

            bookSet.add(s);
        }
        assertEquals(1 , bookSet.size());
        }

    @Test
    void AddCollectionTest()
    {
        Collection<Object> book = new LinkedHashSet<>();
        for (int i = 0 ;  i < 15 ; i++)
        {
            int bookNr = 15 + i ;
            Book s = new Book ("Hunt" , bookNr);
            book.add(s);
        }
        assertEquals(15 , book.size());
        }

    @Test
    void RemoveCollectionTest()
    {
        Collection<Object> book = new LinkedHashSet<>();
        for (int i = 0 ;  i < 15 ; i++)
        {
            int bookNr = 15 + i ;
            Book s = new Book ("Hunt" , bookNr);
            book.add(s);
        }
        Book b = new Book("Reaper", 15);
        book.add(b);
        book.removeAll(book);
        assertEquals(0, book.size());
    }

    @Test
    void FindCollectionTest()
    {
        Collection<Object> book = new LinkedHashSet<>();
        for (int i = 0 ;  i < 15 ; i++)
        {
            int bookNr = 15 + i ;
            Book s = new Book ("Hunt" , bookNr);
            book.add(s);
        }
        int bookNr = 120;
        Book L = new Book("Reaper" , bookNr);
        book.add(L);
        boolean isthere = false;

        if(book.contains(L))
        {
            isthere = true ;
        }
        assertSame(true , isthere);
        System.out.println(book);
        }
}