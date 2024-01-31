import React from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";

import "./App.css";
import Landing from "./pages/landing";
import Login from "./pages/login";
import Register from "./pages/register";
import Booking from "./pages/booking";
import Home from "./pages/home";
import Feedback from "./pages/feedback";
import Profile from "./pages/profile";
import Admin from "./pages/admin";
import AdminLogin from "./pages/admin_login";
function App() {
  return (
    <Router>
      <div>
        <Routes>
          <Route path="/" element={<Landing></Landing>} />
          <Route path="/login" element={<Login></Login>} />
          <Route path="/register" element={<Register></Register>} />
          <Route path="/booking" element={<Booking></Booking>} />
          <Route path="/home" element={<Home></Home>} />
          <Route path="/feedback" element={<Feedback></Feedback>} />
          <Route path="/profile" element={<Profile></Profile>} />
          <Route path="/admin" element={<Admin></Admin>} />
          <Route path="/admin_login" element={<AdminLogin></AdminLogin>} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
