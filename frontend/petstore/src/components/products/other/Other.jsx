import React, { useState } from 'react';
import CardWrapper from '../../cards/CardWrapper';

const Other = () => {
    const [data, setData] = useState([
        // Other data objects
    ]);

    return <CardWrapper data={data} />;
};

export default Other;
