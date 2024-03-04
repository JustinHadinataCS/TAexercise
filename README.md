class Animal:

    # Constructor
    def __init__(self, name, age):
        self.name = name
        self.age = age

    # Setters and getters
    def set_name(self, name):
        self.name = name

    def get_name(self):
        return self.name

    def set_age(self, age):
        self.age = age

    def get_age(self):
        return self.age

    # Abstract method
    def make_sound(self):
        pass

# Child class of Animal
class Lion(Animal):

    def __init__(self, name, age):
        super().__init__(name, age)

    # Override the make_sound method
    def make_sound(self):
        print("The lion roars.")

# Driver class
class Driver:

    def __init__(self):
        self.animal = Lion("Leo", 10)

    def run(self):
        self.animal.make_sound()

# Create a driver object and run the code
driver = Driver()
driver.run()
