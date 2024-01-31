import React from "react";
import Admin_Nav from "../components/admin_nav";
import videoBg from "../assets/sample_4.mp4";
const Admin = () => {
  return (
    <>
      <div className="main">
        <Admin_Nav></Admin_Nav>
        <div className="overlay"></div>
        <video src={videoBg} autoPlay loop muted />
        <h1 className="land_text">
          This is the Admin Page for this application! It contains the Main
          Navbar and facility to navigate everypage and obtain insights!
        </h1>
        {/* </div> */}
      </div>
    </>
  );
};
export default Admin;
