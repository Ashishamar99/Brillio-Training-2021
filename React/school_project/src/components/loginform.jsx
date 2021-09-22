import React, { Component } from "react";
import axios from "axios";
import ReusableInput from './reusableinputprops'
import ReusableButtonProps from "./reusablebuttonprops";

export default class LoginForm extends Component {
  state = {
    username: "",
    password: "",
    accessToken: "",
  };
  handleSubmit = (event) => {
    event.preventDefault();
    const customer = {
      username: this.state.username,
      password: this.state.password,
    };
    console.log(customer);
    axios
      .post("http://localhost:8080/api/auth/signin", customer)
      .then((res) => {
        console.log(res.data.accessToken);
        const accessToken1 = "Bearer " + res.data.accessToken;
        this.setState({ accessToken: accessToken1 });
        localStorage.setItem("Authorization", accessToken1);
      })
      .catch((error) => {
        console.log(error);
      });
  };
  render() {
    return (
      <div>
        <form>

          {/* <label>username</label>
          <input
            name="username"
            onChange={(e) => this.setState({ username: e.target.value })}
          /> */}

          {/* WE WILL IMPLEMENT THE ABOVE COMMENTED INPUT USING A REUSABLE_INPUT_PROPS */}

          <ReusableInput
            id="username"
            name="username"
            handleChange={(e) => this.setState({ username: e.target.value })}
          />

          <label>password</label>
          <input
            name="password"
            type="password"
            onChange={(e) => this.setState({ password: e.target.value })}
          />


          {/* IMPLEMENTING REUSABLE BUTTONS INSTEAD OF A NORMAL BUTTON */}
          {/* <button onClick={this.handleSubmit}>Submit</button> */}

          <ReusableButtonProps value="Submit" handleClick={this.handleSubmit}/>

          <div>{this.state.accessToken}</div>
        </form>
      </div>
    );
  }
}