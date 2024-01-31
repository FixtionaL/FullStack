import React from "react";
import { Nav } from "rsuite";
import { Link } from "react-router-dom";

const Navbar = ({ active, onSelect, ...props }) => {
  return (
    <Nav {...props} activeKey={active} onSelect={onSelect}>
    <Nav.Item eventKey="land">
      <Link to="/">Your Bash</Link>
    </Nav.Item>
    </Nav>
  );
};

const Landing_Nav_2 = () =>  {
  const [active, setActive] = React.useState("land");

  return (
    <div className="land_nav">
      <Navbar active={active} onSelect={setActive} />
    </div>
  );
};

export default Landing_Nav_2;

