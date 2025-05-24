#include <iostream>
#include <iostream>
using namespace std;
struct nodo
{
    char nombre;//nombre del vertice o nodo
    struct nodo *siguiente;
    struct arista *adyacencia;//puntero - primera arista del nodo
};
struct arista
{
    struct nodo *destino;//puntero al nodo llegada
    struct arista *siguiente;
};
typedef struct nodo *Tnodo;// Nodo
typedef struct arista *Tarista; // Arista
void menu();
void insertar_nodo();
void agrega_arista(Tnodo &, Tnodo &, Tarista &);
void insertar_arista();
void vaciar_aristas(Tnodo &);
void eliminar_nodo(Tnodo &, char);
void eliminar_arista(Tnodo &, char);
void mostrar_grafo();
void mostrar_aristas(Tnodo &);
void mostrar_matriz(char x,char y);
void mostrar_aristas_matriz(Tnodo &);
Tnodo p;//puntero cabeza

int numero_nodos = 0;

int main(int argc, char *argv[])
{
    p=nullptr;
    int op;
    do{
        menu();
        cout<<"\n INGRESE OPCION: "<<endl;
        cin>>op;
        switch(op)
        {
            case 1: insertar_nodo();break;
            case 2: insertar_arista(); break;
            case 3:
                char num_nodo;
                cout<<"que nodo quiere eliminar seleccione el numero: "<<endl;
                cin>>num_nodo;
                eliminar_nodo(p,num_nodo); break;
            case 4:
                char num_ari;
                cout<<"que aristas del nodo quiere eliminar seleccione el numero: "<<endl;
                cin>>num_ari;
                eliminar_arista(p, num_ari); break;
            case 5: vaciar_aristas(p); break;
            case 6: mostrar_grafo(); break;
            case 7: mostrar_aristas(p); break;
            case 8: mostrar_aristas_matriz(p); break;
            case 9: cout<<"Saliendo..."<<endl; break;
            default: cout<<"OPCION NO VALIDA"; break;
        }
        cout<<endl<<endl;
        system("cls");
    }while(op!=9);
    return 0;
}
void menu()
{
    cout<<"\n\t GRAFOS DIRIGIDO \n\n";
    cout<<" 1. INSERTAR UN NODO "<<endl;
    cout<<" 2. INSERTAR UNA ARISTA "<<endl;
    cout<<" 3. ELIMINAR UN NODO "<<endl;
    cout<<" 4. ELIMINAR UNA ARISTA "<<endl;
    cout<<" 5. VACIAR ARISTAS "<<endl;
    cout<<" 6. MOSTRAR GRAFO "<<endl;
    cout<<" 7. MOSTRAR ARISTAS DE UN NODO "<<endl;
    cout<<" 8. Mostrar matriz"<<endl;
    cout<<" 9. SALIR "<<endl;
}
void insertar_nodo()
{
    Tnodo t,nuevo=new struct nodo;
    cout<<"INGRESE VARIABLE:";
    cin>>nuevo->nombre;
    nuevo->siguiente = nullptr;
    nuevo->adyacencia = nullptr;
    if(p==nullptr)
    {
        p = nuevo;
        cout<<"PRIMER NODO";
    }
    else
    {
        t = p;
        while(t->siguiente!=nullptr)
        {
            t = t->siguiente;
        }
        t->siguiente = nuevo;
        cout<<"NODO INGRESADO";
    }
    numero_nodos++;
}
void agrega_arista(Tnodo &aux, Tnodo &aux2, Tarista &nuevo)
{
    Tarista q;
    if(aux->adyacencia==nullptr)
    {
        aux->adyacencia=nuevo;
        nuevo->destino=aux2;
        cout<<"PRIMERA ARISTA";
    }
    else
    {
        q=aux->adyacencia;
        while(q->siguiente!=nullptr)
        q=q->siguiente;
        nuevo->destino=aux2;
        q->siguiente=nuevo;
        cout<<"ARISTA AGREGADA";
    }
}
void insertar_arista()
{
    char ini, fin;
    Tarista nuevo=new struct arista;
    Tnodo aux, aux2;
    if(p==nullptr) { cout<<"GRAFO VACIO"; return;}
    nuevo->siguiente=nullptr;
    cout<<"INGRESE NODO DE INICIO:";
    cin>>ini;
    cout<<"INGRESE NODO FINAL:";
    cin>>fin;
    aux=p;
    aux2=p;
    while(aux2!=nullptr)
    {
        if(aux2->nombre==fin) { break;}
        aux2=aux2->siguiente;
    }
    while(aux!=nullptr)
    {
        if(aux->nombre==ini)
        {
            agrega_arista(aux,aux2, nuevo);
            return;
        }
        aux = aux->siguiente;
    }
}

void vaciar_aristas(Tnodo &p)
{
    Tnodo ptr;
    Tarista arista, borrada;
    ptr=p;
    cout<<"NODO|LISTA DE ADYACENCIA\n";
    if (ptr!=nullptr)
    {
        while(ptr!=nullptr)
        {
            cout<<" "<<ptr->nombre<<"|";
            if(ptr->adyacencia!=nullptr)
            {
                arista=ptr->adyacencia;
                while(arista!=nullptr)
                {
                    borrada = arista;
                    cout<<"b: "<<borrada->destino->nombre<<endl;
                    arista = arista->siguiente;
                    ptr->adyacencia = ptr->adyacencia->siguiente;
                    delete(borrada);
                }
                ptr=ptr->siguiente;
                cout<<endl;
                cout<<"Aristas vaciadas correctamente"<<endl;
            }
        }
    }
    else
    {
        cout<<"      Lista vacia"<<endl;
    }
    system("pause");
}

int tabla[5][5];
void mostrar_matriz(char x, char y)
{
    int i, j;

    switch (x)
    {
        case '1':
            i = 0;
            break;
        case '2':
            i = 1;
            break;
        case '3':
            i = 2;
            break;
        case '4':
            i = 3;
            break;
    }

    switch (y)
    {
        case '1':
            j = 0;
            break;
        case '2':
            j = 1;
            break;
        case '3':
            j = 2;
            break;
        case '4':
            j = 3;
            break;
    }

    tabla[i][j] = 1;
}

void mostrar_grafo()
{
    Tnodo ptr;
    Tarista arista;
    ptr=p;
    cout<<"NODO|LISTA DE ADYACENCIA\n";
    if (ptr!=nullptr)
    {
        while(ptr!=nullptr)
        {
            cout<<" "<<ptr->nombre<<"|";
            if(ptr->adyacencia!=nullptr)
            {
                arista=ptr->adyacencia;
                while(arista!=nullptr)
                {
                    cout<<" "<<arista->destino->nombre;
                    mostrar_matriz(ptr->nombre,arista->destino->nombre);
                    arista=arista->siguiente;
                }
            }
            ptr=ptr->siguiente;
            cout<<endl;
        }
        for(int i=0;i<numero_nodos;i++)
        {
            for(int j=0;j<numero_nodos;j++)
            {
                cout<<" "<<tabla[i][j];
            }cout<<endl;
        }
    }
    else
    {
        cout<<"      Lista vacia"<<endl;
    }
    system("pause");
}

void eliminar_arista(Tnodo &p, char nod)
{
    Tnodo ptr;
    Tarista arista, borrada;
    ptr=p;
    if (ptr!=nullptr)
    {
        while(ptr!=nullptr)
        {
            if (ptr->nombre == nod)
            {
                cout<<" "<<ptr->nombre<<"|";
                if(ptr->adyacencia!=nullptr)
                {
                    arista=ptr->adyacencia;
                    while(arista!=nullptr)
                    {
                        borrada = arista;
                        cout<<"b: "<<borrada->destino->nombre<<endl;
                        arista = arista->siguiente;
                        ptr->adyacencia = ptr->adyacencia->siguiente;
                        delete(borrada);
                    }
                    cout<<"Aristas borradas correctamente"<<endl;
                }
            }
            else
            {
                cout<<"no se encontro el nodo"<<endl;
            }
            ptr=ptr->siguiente;
            cout<<endl;
        }
    }
    else
    {
        cout<<"      Lista vacia"<<endl;
    }
    system("pause");
}

void eliminar_nodo(Tnodo &p, char nod)
{
    Tnodo ptr, aux;
    ptr = p;
    cout<<"NODO|LISTA DE ADYACENCIA\n";
    if (ptr!=nullptr)
    {
        //primer nodo
        if (ptr->nombre == nod)
        {
            eliminar_arista(p,nod);
            cout<<"Nodo ptr: "<<ptr->nombre<<endl;
            aux = ptr;
            ptr = ptr->siguiente;
            cout<<"aux: "<<aux->nombre<<endl;
            delete(aux);
            cout<<"Nodo eliminado correctamente"<<endl;
            numero_nodos--;
            p = ptr; // Asignar el nuevo primer nodo a p
        }
        else
        {
            Tnodo ini, des;
            ini = p;
            des = ini->siguiente;
            while(des!=nullptr)
            {
                if (des->nombre == nod)
                {
                    eliminar_arista(p, nod);
                    ini -> siguiente = des -> siguiente; // Saltar el nodo a eliminar
                    delete(des); // Liberar la memoria del nodo a eliminar
                    cout<<"Nodo eliminado correctamente"<<endl;
                    numero_nodos--;
                    break;
                }
                ini = des;
                des = des->siguiente;
            }
            cout<<endl;
        }
    }
    else
    {
        cout<<"      Lista vacia"<<endl;
    }
    system("pause");
}

void mostrar_aristas(Tnodo &p)
{
    Tnodo ptr;
    Tarista arista, borrada;
    ptr=p;
    cout<<"ARISTAS Y DIRECCION\n";
    if (ptr!=nullptr)
    {
        while(ptr!=nullptr)
        {
            if(ptr->adyacencia!=nullptr)
            {
                arista=ptr->adyacencia;
                while(arista!=nullptr)
                {
                    borrada = arista;
                    cout<<" "<<ptr->nombre<<"->";
                    cout<<" "<<borrada->destino->nombre<<endl;
                    arista = arista->siguiente;
                }
                ptr=ptr->siguiente;
                cout<<endl;
            }
        }
    }
    else
    {
        cout<<"      Lista vacia"<<endl;
    }
    system("pause");
}

void mostrar_aristas_matriz(Tnodo &p)
{
    Tnodo ptr;
    Tarista arista;
    ptr=p;
    if (ptr!=nullptr)
    {
        while(ptr!=nullptr)
        {
            if(ptr->adyacencia!=nullptr)
            {
                arista=ptr->adyacencia;
                while(arista!=nullptr)
                {
                    mostrar_matriz(ptr->nombre,arista->destino->nombre);
                    arista=arista->siguiente;
                }
            }
            ptr=ptr->siguiente;
            cout<<endl;
        }
        cout<<"   ";
        for(int x=0;x<numero_nodos;x++)
        {
            cout<<x+1<<"| ";
        }
        cout<<endl;
        for(int i=0;i<numero_nodos;i++)
        {
            cout<<" |";
            for(int x=0;x<numero_nodos;x++)
            {
                cout<<"--|";
            }
            cout<<endl;
            cout<<i<<"|";
            for(int j=0;j<numero_nodos;j++)
            {
                cout<<" "<<tabla[i][j]<<"|";
                tabla[i][j] = 0;
            }cout<<endl;
        }
        for(int x=0;x<numero_nodos;x++)
        {
            cout<<"---";
        }cout<<endl;
    }
    else
    {
        cout<<"      Lista vacia"<<endl;
    }
    system("pause");
}

