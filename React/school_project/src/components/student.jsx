import React, { Component } from 'react';
import axios from 'axios';

class Student extends Component {

    state = {
        studentData:[],
    };

    //////////////////////////////// we will be loading the backend data using componentDidMount.
    componentDidMount() {
        axios
        .get('http://localhost:9092/displayStudents') //Have to specify http protocol.
        .then((response) => {
            console.table(response.data);
            this.setState({studentData: response.data})
        }).catch((err) => {
            console.error(err);
        })
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////
    //getData will need a button to be called.
    // getData = async() => {
    //     // let response = await axios.get("localhost:9092/displayStudents");
    //     // this.setState({
    //     //     studentData: response.data
    //     // });

    //     axios
    //     .get('http://localhost:9092/displayStudents') //Have to specify http protocol.
    //     .then((response) => {
    //         console.table(response.data);
    //         this.setState({studentData: response.data})
    //     }).catch((err) => {
    //         console.error(err);
    //     })
    // }

    render() { 
        return <div>
                <table>
                    <tbody>
                    {this.state.studentData.map((singleStudent) => {
                        return (
                            <tr>
                                <td>{singleStudent.sid}</td>
                                <td>{singleStudent.fname}</td>
                                <td>{singleStudent.lname}</td>
                                <td>{singleStudent.dob}</td>
                                <td>{singleStudent.address}</td>
                                
                                {/*
                                NOTE - 
                                //WE CAN ALSO USE THE BELOW SYNTAX FOR ACCESSING THE DATA
                                <td>{x["address"]}</td> */}

                            </tr>
                            );
                    })}
                    </tbody>
                </table>
                    <br />
                    {/* <button onClick={this.getData}>Get Data</button> */}
                </div>;
    }
}
 
export default Student;