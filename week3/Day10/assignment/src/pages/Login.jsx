import { useNavigate } from "react-router-dom";
import { useEffect } from "react";

function Login() {

    const navigate = useNavigate();

    useEffect(() => {
        const isAuthenticated = localStorage.getItem("isAuthenticated");
        if(isAuthenticated) {
            navigate('/dashboard');
        }
    },[navigate])

    const handleClick = () => {
        localStorage.setItem("isAuthenticated", "true");
        navigate('/dashboard');
    }

    return <div className="login-container">
        <button className="button" onClick={handleClick}>Login</button>
    </div>

}

export default Login;