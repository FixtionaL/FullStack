import React from "react";
import Landing_Nav from "../components/landing_nav";
import videoBg from '../assets/sample.mp4'

// import Main_Nav from "../components/home_nav";

const Landing = () => {
  return (
    <>
      {/* <div className="text_container"> */}
      <div className='main'>
        <Landing_Nav></Landing_Nav>
        <div className="overlay"></div>
        <video src={videoBg} autoPlay loop muted />
        {/* <div className="content"> */}
          {/* <div className="land_nav"> */}
          {/* </div> */}
          <h1 className="land_text">
              This is the landing page. It should contain a navigation bar at the top that links to Sign In, Sign Up Dashboard Pages!
          </h1>
        {/* </div> */}
    </div>
        
      {/* </div> */}
    </>
  );
};

export default Landing;
