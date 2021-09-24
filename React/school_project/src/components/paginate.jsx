import React, { Component } from "react";
import "bootstrap/dist/css/bootstrap.min.css";
// import "bootstrap/dist/css/"
import "react-bootstrap-table-next/dist/react-bootstrap-table2.css";
import BootstrapTable from "react-bootstrap-table-next";

class Paginate extends React.Component {

    constructor(props) {
        super(props);
    }

    render() { 
        return <div>
        <h5>React Bootstrap Table Next with Sorting</h5>

        <BootstrapTable
            bootstrap4
            keyField={this.props.id}
            data={this.props.data}
            columns={this.props.columns}
          //   defaultSorted={defaultSorted}
        />
        </div>
    }
}

export default Paginate;