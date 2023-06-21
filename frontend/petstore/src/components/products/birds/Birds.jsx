import React, { useState } from 'react';
import CardWrapper from '../../cards/CardWrapper';

const Birds = () => {
    const [data, setData] = useState([
        // Birds data objects
    ]);

    return <CardWrapper data={data} />;
};

export default Birds;
