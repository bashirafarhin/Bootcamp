import { useEffect } from "react"
import { useNavigate } from "react-router-dom";

function ProtectedRoute ({ children }) {

    const navigate = useNavigate();

    useEffect(() => {
        const isAuthenticated = localStorage.getItem("isAuthenticated");
        if(!isAuthenticated) {
            navigate('/');
        }
    })
    return children
}

export default ProtectedRoute