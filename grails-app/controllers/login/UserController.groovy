package login

class UserController {

    def index() {

        redirect(action: "login")
    }

    def login ={ }

    def autenticate ={
        def user= User.findByUserNameAndPassword(params.userName , params.password)
        if(user){
            session.user= user
            flash.message= "Hello, ${user.fullName}!"
            redirect(action: "login")
        }else{
            flash.message= "Sorry,${params.userName}, please try again."
            redirect(action: "login")
        }
    }

    def logout ={
        flash.message = "Goodbye ${sesssion.user.fullName}"
        session.user= null
        redirect(action: "login")
    }
}
