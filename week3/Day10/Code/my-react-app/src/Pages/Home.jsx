import { Link } from "react-router-dom";

function Home() {
  return (
    <div style={{ textAlign: "center" }}>
      <h1>🏠 Home Page</h1>
      <p>This is a public page accessible by anyone.</p>
      <Link to="/login">Go to Login</Link>
    </div>
  );
}

export default Home;
