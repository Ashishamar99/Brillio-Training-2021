import React, { Component } from 'react';
import axios from 'axios';

class Student extends Component {

    state = {
        studentData:[],
    };

    getData = async() => {
        // let response = await axios.get("localhost:9092/displayStudents");
        // this.setState({
        //     studentData: response.data
        // });

        axios
        .get('http://localhost:9092/displayStudents') //Have to specify http protocol.
        .then((response) => {
            console.table(response.data);
            this.setState({studentData: response.data})
        }).catch((err) => {
            console.error(err);
        })
    }

    render() { 
        return <div>
                <table>
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
                </table>
                    <br />
                    <button onClick={this.getData}>Get Data</button>
                </div>;
    }
}
 
export default Student;