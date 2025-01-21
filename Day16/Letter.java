package Day16;

public class Letter {
    String name;
    char Char;
    Letter(String name)
    {
        this.name =  name;
        this.Char = 'A';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getChar() {
        return Char;
    }

    public void setChar(char aChar) {
        Char = aChar;
    }
}
