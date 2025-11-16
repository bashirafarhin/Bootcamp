import { BrowserRouter, Routes, Route, Navigate } from 'react-router-dom'
import { lazy } from 'react'
import './App.css'

const Login = lazy(() => import("./pages/Login"));
const Dashboard = lazy(() => import("./pages/Dashboard"));
const ProtectedRoute = lazy(() => import("./routes/ProtectedRoute"))
const Clock = lazy(() => import("./pages/Clock"))
const DigitalClock = lazy(() => import("./pages/DigitalClock"))
const NotFound = lazy(() => import("./pages/NotFound"))

function App() {

  return (
    <BrowserRouter>
    <Routes>

      {/* Redirect "/" → "/login" */}
      <Route path="/" element={<Navigate to="/login" replace />} />

      <Route path='/login' element={<Login />} />
        <Route path='/dashboard' element={<ProtectedRoute><Dashboard /></ProtectedRoute>}>
         <Route path='clock' element={<Clock />} />
         <Route path='digital-clock' element={<DigitalClock />} />
        </Route>
        <Route path='*' element={<NotFound />} />
    </Routes>
    </BrowserRouter>
  )
}

export default App