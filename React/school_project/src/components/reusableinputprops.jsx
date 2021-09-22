import React from 'react';

class ReusableInput extends React.Component {

    constructor(props) {
        super(props);
    }

    render() { 
        return <div>
            <label for={this.props.id}>{this.props.name}</label>
            <input id={this.props.id} name={this.props.name} type="text" value={this.props.value} onChange={this.props.handleChange}/>
            {/* handleChange is NOT a keyword */}
        </div>;
    }
}

export default ReusableInput;