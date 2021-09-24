import React, { Component } from 'react';
import axios from 'axios';
import Paginate from './paginate';

let api = axios.create({baseURL: 'http://localhost:9092'});

class Student extends Component {

    state = {
        studentData:[],

        columns: [
            { dataField: 'sid', text: 'Student ID', sort: true },
            { dataField: 'fname', text: 'First Name', sort: true },
            { dataField: 'lname', text: 'Last Name', sort: true },
            { dataField: 'dob', text: 'DOB', sort: true },
            { dataField: 'address', text: 'Address', sort: true },
        ]
    };

    //////////////////////////////// we will be loading the backend data using componentDidMount.
    componentDidMount() {
        api
        .get('/displayStudents')
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
                {/* <table>
                    <tbody>
                    {this.state.studentData.map((singleStudent) => {
                        return (
                            <tr>
                                <td>{singleStudent.sid}</td>
                                <td>{singleStudent.fname}</td>
                                <td>{singleStudent.lname}</td>
                                <td>{singleStudent.dob}</td>
                                <td>{singleStudent.address}</td> */}
                                
                                {/*
                                NOTE - 
                                //WE CAN ALSO USE THE BELOW SYNTAX FOR ACCESSING THE DATA
                                <td>{x["address"]}</td> */}

                            {/* </tr>
                            );
                    })}
                    </tbody>
                </table> */}
        <Paginate
          id="sid"
          data={this.state.studentData}
          columns={this.state.columns}
        />
        </div>
    }
}
 
export default Student;