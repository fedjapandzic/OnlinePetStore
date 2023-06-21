
import React, { useState } from 'react';
import CardWrapper from '../../cards/CardWrapper';
const Cat = () => {
    const [data, setData] = useState([
        {
            title: "Beautiful Landscape",
            description: "A breathtaking view of mountains and lakes.",
            imageUrl: "https://i.guim.co.uk/img/media/03734ee186eba543fb3d0e35db2a90a14a5d79e3/0_173_5200_3120/master/5200.jpg?width=1200&height=900&quality=85&auto=format&fit=crop&s=9c30ed97ea8731f3e2a155467201afe3",
        },
        {
            title: "Beautiful Landscape",
            description: "A breathtaking view of mountains and lakes.",
            imageUrl: "https://i.guim.co.uk/img/media/03734ee186eba543fb3d0e35db2a90a14a5d79e3/0_173_5200_3120/master/5200.jpg?width=1200&height=900&quality=85&auto=format&fit=crop&s=9c30ed97ea8731f3e2a155467201afe3",
        }, {
            title: "Beautiful Landscape",
            description: "A breathtaking view of mountains and lakes.",
            imageUrl: "https://i.guim.co.uk/img/media/03734ee186eba543fb3d0e35db2a90a14a5d79e3/0_173_5200_3120/master/5200.jpg?width=1200&height=900&quality=85&auto=format&fit=crop&s=9c30ed97ea8731f3e2a155467201afe3",
        }, {
            title: "Beautiful Landscape",
            description: "A breathtaking view of mountains and lakes.",
            imageUrl: "https://i.guim.co.uk/img/media/03734ee186eba543fb3d0e35db2a90a14a5d79e3/0_173_5200_3120/master/5200.jpg?width=1200&height=900&quality=85&auto=format&fit=crop&s=9c30ed97ea8731f3e2a155467201afe3",
        }, {
            title: "Beautiful Landscape",
            description: "A breathtaking view of mountains and lakes.",
            imageUrl: "https://i.guim.co.uk/img/media/03734ee186eba543fb3d0e35db2a90a14a5d79e3/0_173_5200_3120/master/5200.jpg?width=1200&height=900&quality=85&auto=format&fit=crop&s=9c30ed97ea8731f3e2a155467201afe3",
        }, {
            title: "Beautiful Landscape",
            description: "A breathtaking view of mountains and lakes.",
            imageUrl: "https://i.guim.co.uk/img/media/03734ee186eba543fb3d0e35db2a90a14a5d79e3/0_173_5200_3120/master/5200.jpg?width=1200&height=900&quality=85&auto=format&fit=crop&s=9c30ed97ea8731f3e2a155467201afe3",
        }, {
            title: "Beautiful Landscape",
            description: "A breathtaking view of mountains and lakes.",
            imageUrl: "https://i.guim.co.uk/img/media/03734ee186eba543fb3d0e35db2a90a14a5d79e3/0_173_5200_3120/master/5200.jpg?width=1200&height=900&quality=85&auto=format&fit=crop&s=9c30ed97ea8731f3e2a155467201afe3",
        },
    ]);
    return (
        <CardWrapper data={data}></CardWrapper>
    );
}


export default Cat;