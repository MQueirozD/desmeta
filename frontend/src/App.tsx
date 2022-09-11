import NotificationButton from "./componetes/NotificationButton"
import Header from "./componetes/Header"
import SalesCard from "./componetes/SalesCard"
import { ToastContainer } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';

function App() {
    return (
        <>
        <ToastContainer/>
            <Header />
            <main>
                <section id="sales">
                    <div className="dsmeta-container">
                        <SalesCard/>
                    </div>
                </section>
            </main>

        </>
    )
}

export default App
