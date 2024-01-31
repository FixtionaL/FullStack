import React from "react";
import "rsuite/dist/rsuite-no-reset.min.css";
import { Nav } from "rsuite";
import { Link } from "react-router-dom";

const Navbar = ({ active, onSelect, ...props }) => {
  return (
    <Nav {...props} activeKey={active} onSelect={onSelect}>
      <Nav.Item eventKey="land">
        <Link to="/">Your Bash</Link>
      </Nav.Item>
      <Nav.Item eventKey="home">
        <Link to="/home">Home</Link>
      </Nav.Item>
      {/* <Nav.Item eventKey="login">
        <Link to="/login">Sign In</Link>
      </Nav.Item>
      <Nav.Item eventKey="register">
        <Link to="/register">Sign Up</Link>
      </Nav.Item> */}
      <Nav.Item eventKey="booking">
        <Link to="/booking">Booking</Link>
      </Nav.Item>
      <Nav.Item eventKey="feedback">
        <Link to="/feedback">Feedback</Link>
      </Nav.Item>
      <Nav.Item eventKey="profile">
        <Link to="/profile">Profile</Link>
      </Nav.Item>
    </Nav>
  );
};

const Admin_Nav = () => {
  const [active, setActive] = React.useState("landing");

  return (
    <>
      <Navbar active={active} onSelect={setActive} />
    </>
  );
};

export default Admin_Nav;
