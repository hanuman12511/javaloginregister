
<style>
    .main-div{
        width: 100%;
        height: 600px;
       
        position: relative;
    }
    .form-div{
        width: 40%;
        height: 80%;
        position: relative;
        left: 30%;
        top:10%;
     
        border-radius: 20px;
        box-shadow: 1px 1px 20px 10px rgb(230, 228, 228);
        text-align: center;
        padding: 20px;
       
    }
    .input-section{
        width: 70%;
        height: 15%;
       
        position: relative;
        left: 15%;
        text-align: left;
        padding-bottom: 10px;
        border-bottom: 1px solid #e9e9e9;
    
    }
    .input-section p{
        margin-left: 10px;
    }
    .img-inp{
        position: relative;
        align-items: center;
        display: flex;
    }
    .img-inp input{
        height: 30px;
        width: 80%;
        border: 0px;
        
    }
    .input-section-forgot{
        text-align: right;
        margin-right: 100px;
    }
    .input-section-btn button{
       
       width: 70%;
       padding: 10px;
       background-color: aqua;
       border: 0px;
       border-radius: 10px;
    }
    
    </style>
    <div class="main-div">
        <div class="form-div">
            <h2>Register</h2>
            <form action="register" method="post">
            <div class=" input-section">
                <p>Username</p>
                <div class="img-inp">
                <img src="./img/icons8-user-90.png" alt="" width="35px" height="35px">
                <input type="text" name="name" id="" placeholder="type your username">
                </div>
    
            </div>
            <div class=" input-section">
                <p>Email</p>
                <div class="img-inp">
                <img src="./img/icons8-user-90.png" alt="" width="35px" height="35px">
                <input type="text" name="email" id="" placeholder="type your email">
                </div>
    
            </div>
            <div class=" input-section">
                <p>Password</p>
                <div class="img-inp">
                <img src="./img/icons8-password-90 (3).png" alt="" width="35px" height="35px">
                <input type="text" name="password" id="" placeholder="type your password">
                </div>
    
            </div>
            <div class=" input-section-forgot">
               
                
                </div>
    
                <div class=" input-section-btn">
                   
                   <button>Register</button>
        
                </div>
                </form>
                    <div> <a href="index.jsp">Login</a></div>
            </div>
    
    
        </div>
    </div>
    
    