import { useNavigate } from "react-router-dom";

function Dashboard({ onLogout }) {
  const navigate = useNavigate();

  const handleLogout = () => {
    onLogout();
    navigate("/login");
  };

  return (
    <div style={{ textAlign: "center" }}>
      <h1>📊 Dashboard</h1>
      <p>Welcome! You are logged in 🎉</p>
      <button onClick={handleLogout}>Logout</button>
    </div>
  );
}

export default Dashboard;
