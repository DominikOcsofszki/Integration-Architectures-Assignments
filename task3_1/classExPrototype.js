function Person (firstName, lastName) {
        this._firstName = firstName;
        this._lastName = lastName;

        this.greet = function() {
            console.log('Hello!');
          };
    }

const person1 = new Person("Dominik", "Ocsofszki");
console.log(person1)
person1.greet();
