import React, { useState } from "react";
import Landing_Nav_2 from "../components/land_nav_2";
// import '../App.css';
import { useNavigate } from "react-router-dom";
const Login = () => {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [emailError, setEmailError] = useState("");
  const [passwordError, setPasswordError] = useState("");
  const Navigate = useNavigate();
  const handleChange = () => {
    Navigate("/home");
  };

  return (
    <>
      <Landing_Nav_2/>
      <div className={"mainContainer"}>
        <div className={"titleContainer"}>
          <div>Sign In Page</div>
        </div>
        <br />
        <div className={"inputContainer"}>
          <input
            value={email}
            type="email"
            placeholder="Enter your email here"
            onChange={(ev) => setEmail(ev.target.value)}
            className={"inputBox"}
          />
          <label className="errorLabel">{emailError}</label>
        </div>
        <br />
        <div className={"inputContainer"}>
          <input
            value={password}
            placeholder="Enter your password here"
            type="password"
            onChange={(ev) => setPassword(ev.target.value)}
            className={"inputBox"}
          />
          <label className="errorLabel">{passwordError}</label>
        </div>
        <br />
        <div className={"inputContainer"}>
          {/* <Link to="/home"> */}
          <input
            className={"inputButton"}
            onClick={handleChange}
            type="button"
            value={"Hop in!"}
          />
          {/* </Link> */}
        </div>
      </div>
    </>
  );
};

export default Login;
