import React from "react";
import "rsuite/dist/rsuite-no-reset.min.css";
import { Nav } from "rsuite";
import { Link } from "react-router-dom";

const Navbar = ({ active, onSelect, ...props }) => {
  return (
    <Nav {...props} activeKey={active} onSelect={onSelect}>
      <Nav.Item eventKey="home">
        <Link to="/home">Home</Link>
      </Nav.Item>
      <Nav.Item eventKey="booking">
        <Link to="/booking">Booking</Link>
      </Nav.Item>
      <Nav.Item eventKey="feedback">
        <Link to="/feedback">Feedback</Link>
      </Nav.Item>
      <Nav.Item eventKey="profile">
        <Link to="/profile">Profile</Link>
      </Nav.Item>
      <Nav.Item eventKey="logout">
        <Link to="/">LogOut</Link>
      </Nav.Item>
    </Nav>
  );
};

const Main_Nav = () => {
  const [active, setActive] = React.useState("home");

  return (
    <>
      <Navbar active={active} onSelect={setActive} />
    </>
  );
};

export default Main_Nav;
