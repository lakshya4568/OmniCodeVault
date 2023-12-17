class Vehicle:
    def __init__(self, color, model):
        self.color = color
        self.model = model

    def start(self):
        print(f"The {self.color} {self.model} is starting.")

    def stop(self):
        print(f"The {self.color} {self.model} has stopped.")


class Car(Vehicle):
    def accelerate(self):
        print(f"The {self.color} {self.model} is accelerating.")

    def brake(self):
        print(f"The {self.color} {self.model} is braking.")


class Truck(Vehicle):
    def load_cargo(self):
        print(f"The {self.color} {self.model} is loading cargo.")

    def unload_cargo(self):
        print(f"The {self.color} {self.model} is unloading cargo.")


# Creating instances of the classes
my_car = Car(color="Blue", model="Sedan")
my_truck = Truck(color="Red", model="Pickup")

# Using methods
my_car.start()
my_car.accelerate()
my_car.brake()
my_car.stop()

my_truck.start()
my_truck.load_cargo()
my_truck.unload_cargo()
my_truck.stop()
