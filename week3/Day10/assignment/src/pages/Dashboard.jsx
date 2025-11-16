import { Outlet } from "react-router-dom";
import Navbar from "../components/Navbar";

function Dashboard() {
    return <>
        <Navbar />
        <h1 className="text-center">The Dashboard</h1>
        <Outlet />
    </>
}

export default Dashboard;