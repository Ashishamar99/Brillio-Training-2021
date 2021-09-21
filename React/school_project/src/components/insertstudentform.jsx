import React, { Component } from 'react';
import axios from 'axios';

let api = axios.create({baseURL: 'http://localhost:9092'});

class InsertStudent extends React.Component {

    state = {
        sid: '',
        fname: '',
        lname: '',
        dob: '',
        address: ''
    }

    ////////////////////////////////////////////////////////////////

    //HERE WHEN THE FORM IS SUBMITTED THE EVENT.PREVENTDEFAULT DOESNT REFRESH THE PAGE

    // insertData = (event) => {
    //     event.preventDefault(); // Doesn't refresh the page when the form is submitted.

    // }
    ////////////////////////////////////////////////////////////////


    insertData = () => {

        const studentObj = {
            sid: this.state.sid,
            fname: this.state.fname,
            lname: this.state.lname,
            dob: this.state.dob,
            address: this.state.address
        }

        api
        .post('/sdetail/insert', studentObj)
        .then((response) => {
            console.table(response.data);
        }).catch((err) => {
            console.error(err);
        })
    }

    render() { 
        return <div>
            <form>
          <label>sid</label>
          <input
            name="sid"
            onChange={(e) => this.setState({ sid: e.target.value })}
          /><br /><br />
          <label>fname</label>
          <input
            name="fname"
            onChange={(e) => this.setState({ fname: e.target.value })}
          /><br /><br />
          <label>lname</label>
          <input
            name="lname"
            onChange={(e) => this.setState({ lname: e.target.value })}
          /><br /><br />
          <label>dob</label>
          <input
            name="dob"
            onChange={(e) => this.setState({ dob: e.target.value })}
          /><br /><br />
          <label>address</label>
          <input
            name="address"
            onChange={(e) => this.setState({ address: e.target.value })}
          /><br /><br />
          <button onClick={this.insertData}>Submit</button>
        </form>
        </div>;
    }
}

export default InsertStudent;