package pl.kazimierczak.jakub.oop;

public class DbMain {

    public static void main(String[] args) {

        DbRepository dbRepository = new DbRepository();
        VipDbRepository vipDbRepository = new VipDbRepository();

        DbService dbService = new DbService(dbRepository);
        VipDbService vipDbService = new VipDbService(vipDbRepository);

        DbController dbController = new DbController(vipDbService);

        dbController.dashboard();
    }
}

// TODO: 10.03.2023
// Zaprezentować DID - Dependency, Injection, Delegation na własnym przykładzie analogicznie do DbMain