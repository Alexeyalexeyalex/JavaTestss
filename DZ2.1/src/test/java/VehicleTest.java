import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




public class VehicleTest {

    private Car car;
    private Motorcycle moto;

    @BeforeEach
    public void setUp(){
        car = new Car("Mazda","M5",1995);
        moto = new Motorcycle("Yamaha","G700",1990);
    }

//    проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    public void testCarInstanceofVehicle(){
        Assertions.assertInstanceOf(Vehicle.class, car);
    }

//    проверка того, объект Car создается с 4-мя колесами
    @Test
    public void testCarFourWheels(){
        Assertions.assertEquals(car.getNumWheels(), 4);
    }

//    проверка того, объект Motorcycle создается с 2-мя колесами
    @Test
    public void testMotocycleTWoWheels(){
        Assertions.assertEquals(moto.getNumWheels(), 2);
    }

//- проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())

    @Test
    public void testCarTestDrive60(){
        car.testDrive();
        Assertions.assertEquals(car.getSpeed(), 60);
    }

//- проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())

    @Test
    public void testMotocycleTestDrive75(){
        moto.testDrive();
        Assertions.assertEquals(moto.getSpeed(), 75);
    }

//- проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)

    @Test
    public void testCarTestParkSpeed(){
        car.testDrive();
        car.park();
        Assertions.assertEquals(car.getSpeed(), 0);
    }


//- проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)

    @Test
    public void testMotocycleParkSpeed(){
        moto.testDrive();
        moto.park();
        Assertions.assertEquals(moto.getSpeed(), 0);
    }

}
