package login

class User {

    //Atributos de la clase Persona
    String userName
    String password
    String fullName
    String toString(){
        "${fullName}"
    }

    static constrainst ={

        //creando metodos para cada atributo
        fullName()
        userName(unique: true , nullable : false , blank: false)
        password(nullable : false , blank: false , password: true)
    }
}
