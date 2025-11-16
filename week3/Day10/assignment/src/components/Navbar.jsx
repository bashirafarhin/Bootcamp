import { NavLink, useNavigate } from "react-router-dom";

function Navbar() {

   const navigate = useNavigate();

   const handleClick = () => {
      localStorage.removeItem("isAuthenticated");
      navigate('/login');
   }
 return (
    <navbar className="navbar">
       <NavLink className="navbar-link" to="clock">Clock</NavLink>
       <NavLink className="navbar-link" to="digital-clock">Digital Clock</NavLink>
       <button className="button" onClick={handleClick}>Logout</button>
    </navbar>
 )
}

export default Navbar;