import React, { Component } from 'react';


//This is a reusable button
class ReusableButtonProps extends React.Component {

    constructor(props) {
        super(props);
    }

    render() { 
        return <div>
            <button className="button" onClick={this.props.handleClick}> {this.props.value} </button>
        </div>;
    }
}

export default ReusableButtonProps;