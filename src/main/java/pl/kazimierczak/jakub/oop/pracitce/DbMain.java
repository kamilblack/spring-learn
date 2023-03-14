package pl.kazimierczak.jakub.oop.pracitce;

public class DbMain {

    public static void main(String[] args) {

        DbLayer dbLayer = new DbLayer();

        DbService dbService = new DbService(dbLayer);

        DbPresentation dbPresentation = new DbPresentation(dbService);

        dbPresentation.Foo();
    }
}
