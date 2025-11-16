import { useEffect } from "react";
import { useNavigate } from "react-router-dom";

function Login({ onLogin, isAuthenticated }) {
  const navigate = useNavigate();

  useEffect(() => {
    if (isAuthenticated) {
      navigate("/dashboard");
    }
  }, [isAuthenticated, navigate]);

  const handleLogin = () => {
    onLogin();
    navigate("/dashboard");
  };

  return (
    <div style={{ textAlign: "center" }}>
      <h1>🔐 Login Page</h1>
      <p>Click below to log in.</p>
      <button onClick={handleLogin}>Login</button>
    </div>
  );
}

export default Login;
